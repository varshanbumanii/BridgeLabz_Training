$sourcePath = "c:\Users\HP\IdeaProjects\BridgeLabz_Java\src"
$files = Get-ChildItem -Path $sourcePath -Recurse -Filter "*.java"
$renameCount = 0

foreach ($file in $files) {
    try {
        $content = [System.IO.File]::ReadAllText($file.FullName)
        if ($content -match 'public\s+class\s+(\w+)') {
            $className = $matches[1]
            if ($file.BaseName -ne $className) {
                $newPath = Join-Path $file.DirectoryName "$className.java"
                Rename-Item -Path $file.FullName -NewName "$className.java"
                Write-Host "Renamed: $($file.Name) -> $className.java"
                $renameCount++
            }
        }
    } catch {
        Write-Host "Error processing $($file.FullName): $_"
    }
}

Write-Host "`nTotal files renamed: $renameCount"

@echo off
setlocal enabledelayedexpansion

REM This script renames Java files to match their class names

set "basePath=c:\Users\HP\IdeaProjects\BridgeLabz_Java\src"
set "renameCount=0"

for /r "%basePath%" %%F in (*.java) do (
    for /f "tokens=*" %%A in ('findstr /R "public.*class" "%%F" ^| findstr /o "class" ') do (
        REM Extract class name from line
        for /f "tokens=2" %%B in ('echo %%A ^| findstr /R "class.*{" ') do (
            set "className=%%B"
        )
    )
)

echo Total files renamed: !renameCount!
endlocal

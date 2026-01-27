package javacollectionsandstreams.javagenerics;

import java.util.ArrayList;
import java.util.List;

abstract class JobRole {
    private String candidateName;

    public JobRole(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public abstract String getRole();
    public abstract int getScore();
}

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String candidateName, int codingScore) {
        super(candidateName);
        this.codingScore = codingScore;
    }

    private int codingScore;

    public String getRole() {
        return "Software Engineer";
    }

    public int getScore() {
        return codingScore;
    }
}

class DataScientist extends JobRole {
    public DataScientist(String candidateName, int mlScore) {
        super(candidateName);
        this.mlScore = mlScore;
    }

    private int mlScore;

    public String getRole() {
        return "Data Scientist";
    }

    public int getScore() {
        return mlScore;
    }
}

class ProductManager extends JobRole {
    public ProductManager(String candidateName, int strategyScore) {
        super(candidateName);
        this.strategyScore = strategyScore;
    }

    private int strategyScore;

    public String getRole() {
        return "Product Manager";
    }

    public int getScore() {
        return strategyScore;
    }
}

class Resume<T extends JobRole> {
    private T candidate;

    public Resume(T candidate) {
        this.candidate = candidate;
    }

    public T getCandidate() {
        return candidate;
    }
}

public class ResumeScreeningSystem {

    public static <T extends JobRole> boolean evaluateCandidate(Resume<T> resume) {
        return resume.getCandidate().getScore() >= 70;
    }

    public static void processPipeline(List<? extends JobRole> candidates) {
        for (JobRole candidate : candidates) {
            System.out.println(
                    candidate.getCandidateName() + " | " +
                            candidate.getRole() + " | Score: " +
                            candidate.getScore()
            );
        }
    }

    public static void main(String[] args) {

        Resume<SoftwareEngineer> se =
                new Resume<>(new SoftwareEngineer("Arjun", 85));

        Resume<DataScientist> ds =
                new Resume<>(new DataScientist("Meera", 72));

        Resume<ProductManager> pm =
                new Resume<>(new ProductManager("Rahul", 65));

        List<JobRole> pipeline = new ArrayList<>();
        pipeline.add(se.getCandidate());
        pipeline.add(ds.getCandidate());
        pipeline.add(pm.getCandidate());

        processPipeline(pipeline);

        System.out.println("\nShortlisted Candidates:");

        if (evaluateCandidate(se)) {
            System.out.println(se.getCandidate().getCandidateName());
        }
        if (evaluateCandidate(ds)) {
            System.out.println(ds.getCandidate().getCandidateName());
        }
        if (evaluateCandidate(pm)) {
            System.out.println(pm.getCandidate().getCandidateName());
        }
    }
}


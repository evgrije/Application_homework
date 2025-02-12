public class Artifact extends Application{
    private String artifactName;
    private String artifactType;

    public String getArtifactName() {
        return artifactName;
    }

    public void setArtifactName(String artifactName) {
        this.artifactName = artifactName;
    }

    public String getArtifactType() {
        return artifactType;
    }

    public void setArtifactType(String artifactType) {
        this.artifactType = artifactType;
    }

    @Override
    public String toString() {
        return "Artifact{" +
                "artifactName='" + artifactName + '\'' +
                ", artifactType='" + artifactType + '\'' +
                '}';
    }
}

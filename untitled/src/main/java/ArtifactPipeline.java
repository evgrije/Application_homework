import java.util.List;

public class ArtifactPipeline extends Artifact{
    private String artifactPipelineName;
    private boolean artifactHasChild;
    private String scanToolArt;

    Artifact artifact1 = new Artifact();
    Artifact artifact2 = new Artifact();

    private List<Artifact> listOfArtifacts = List.of(artifact1, artifact2);

    public String getArtifactPipelineName() {
        return artifactPipelineName;
    }

    public void setArtifactPipelineName(String artifactPipelineName) {
        this.artifactPipelineName = artifactPipelineName;
    }

    public boolean isArtifactHasChild() {
        return artifactHasChild;
    }

    public void setArtifactHasChild(boolean artifactHasChild) {
        this.artifactHasChild = artifactHasChild;
    }

    public String getScanToolArt() {
        return scanToolArt;
    }

    public void setScanToolArt(String scanToolArt) {
        this.scanToolArt = scanToolArt;
    }

    @Override
    public String toString() {
        return
                "artifactPipelineName ='" + artifactPipelineName + '\'' +
                        ", artifactHasChild ='" + artifactHasChild + '\'' +
                        ", scanToolArtifact ='" + scanToolArt + '\'' +
                        '}';
    }
}

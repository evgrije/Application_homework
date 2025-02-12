public class Application {
    private String appCode;
    private String appName;

    private Pipeline pipeline;

    private CodebasePipeline codebasePipeline;

    private ArtifactPipeline artifactPipeline;

    public String getAppCode() {
        return appCode;
    }

    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public CodebasePipeline getCodebasePipeline() {
        return codebasePipeline;
    }

    public void setCodebasePipeline(CodebasePipeline codebasePipeline) {
        this.codebasePipeline = codebasePipeline;
    }


    public ArtifactPipeline getArtifactPipeline() {
        return artifactPipeline;
    }

    public void setArtifactPipeline(ArtifactPipeline artifactPipeline) {
        this.artifactPipeline = artifactPipeline;
    }


    @Override
    public String toString() {
        return "Application{" +
                "appCode ='" + appCode + '\'' +
                ", appName ='" + appName + '\'' +
                ", codebasePipeline ={" + codebasePipeline +  '\'' +
                ", artifactPipeline ={" + artifactPipeline +
                '}';
    }
}

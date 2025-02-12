public class Main {
    public static void main (String[] args){
        Application app1 = new Application();

        app1.setAppCode("abc123");
        app1.setAppName("ABC123");

        CodebasePipeline app1cb1 = new CodebasePipeline();
        app1cb1.setCodebasePipelineName("pipeline_codebase_name");
        app1cb1.setCodebaseHasChild(true);
        app1cb1.setScanToolCb("appscreener");


        ArtifactPipeline app1art1 = new ArtifactPipeline();
        app1art1.setArtifactPipelineName("pipeline_artifact_name");
        app1art1.setArtifactHasChild(false);
        app1art1.setScanToolArt("trivy");

        app1.setCodebasePipeline(app1cb1);
        app1.setArtifactPipeline(app1art1);

        System.out.println(app1);


    }
}

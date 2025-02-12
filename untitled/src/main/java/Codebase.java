public class Codebase extends Application{
    private String codebaseName;
    private String codebaseBuildTool;
    private String codebaseBranch;

    public String getCodebaseName() {
        return codebaseName;
    }

    public void setCodebaseName(String codebaseName) {
        this.codebaseName = codebaseName;
    }

    public String getCodebaseBuildTool() {
        return codebaseBuildTool;
    }

    public void setCodebaseBuildTool(String codebaseBuildTool) {
        this.codebaseBuildTool = codebaseBuildTool;
    }

    public String getCodebaseBranch() {
        return codebaseBranch;
    }

    public void setCodebaseBranch(String codebaseBranch) {
        this.codebaseBranch = codebaseBranch;
    }

    @Override
    public String toString() {
        return "Codebase{" +
                "codebaseName='" + codebaseName + '\'' +
                ", codebaseBuildTool='" + codebaseBuildTool + '\'' +
                ", codebaseBranch='" + codebaseBranch + '\'' +
                '}';
    }
}

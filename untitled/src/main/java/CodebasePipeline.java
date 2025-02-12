import java.util.Arrays;
import java.util.List;

public class CodebasePipeline extends Codebase{
    private String codebasePipelineName;
    private boolean codebaseHasChild;
    private String scanToolCb;

    Codebase codebase1 = new Codebase();
    Codebase codebase2 = new Codebase();

    Codebase[] listOfCodebase = {codebase1, codebase2};

    //private List<Codebase> listOfCodebases = List.of(codebase1, codebase2);

    public String getCodebasePipelineName() {
        return codebasePipelineName;
    }

    public void setCodebasePipelineName(String codebasePipelineName) {
        this.codebasePipelineName = codebasePipelineName;
    }

    public boolean isCodebaseHasChild() {
        return codebaseHasChild;
    }

    public void setCodebaseHasChild(boolean codebaseHasChild) {
        this.codebaseHasChild = codebaseHasChild;
    }

    public Codebase[] getListOfCodebase() {
        return listOfCodebase;
    }

    public void setListOfCodebase(Codebase[] listOfCodebase) {
        this.listOfCodebase = listOfCodebase;
    }

    public String getScanToolCb() {
        return scanToolCb;
    }

    public void setScanToolCb(String scanToolCb) {
        this.scanToolCb = scanToolCb;
    }

    @Override
    public String toString() {
        return
                "codebasePipelineName ='" + codebasePipelineName + '\'' +
                        ", codebaseHasChild ='" + codebaseHasChild + '\'' +
                        ", codebaseScanTool ='" + scanToolCb + '\'' +
                        '}';
    }
}

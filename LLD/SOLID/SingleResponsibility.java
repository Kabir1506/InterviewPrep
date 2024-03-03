package LLD.SOLID;

public class SingleResponsibility {
    /*
     * Not following Single Responsibility
     */
    downloadFile(File file);
    parseFileData(File file);
    persistTODatabase(File file);
}

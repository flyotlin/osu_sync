package Controller;

import Model.OsuSyncCopier;

import java.io.File;

public class ImportController extends AbstractController {

    @Override
    public void initOsuSync() {
        throw new UnsupportedOperationException("The Operation is now unsupported");
    }

    @Override
    public void updateOsuSync() {
        throw new UnsupportedOperationException("The Operation is now unsupported");
    }

    @Override
    public void checkOsuSync() {
        throw new UnsupportedOperationException("The Operation is now unsupported");
    }

    @Override
    public void exportOsuSync() {

    }

    @Override
    public void importOsuSync() {
        System.out.println("START TESTING IMPORT");
        String filename = "Songs/";

        File source = new File("C:/osuSyncTest/" + filename);
        File dest = new File("C:/osuSyncTest/dest/" + filename);

        OsuSyncCopier copier = new OsuSyncCopier(source, dest);
    }

    @Override
    public void moreOsuSync() {

    }
}

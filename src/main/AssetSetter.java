package main;

import object.OBJ_Door;
import object.OBJ_Vape;

public class AssetSetter {

    GamePanel gp;

    public AssetSetter(GamePanel gp) {

        this.gp = gp;

    }

    public void setObject() {

        gp.obj[0] = new OBJ_Vape();
        gp.obj[0].worldX = 23 * gp.tileSize;
        gp.obj[0].worldY = 7 * gp.tileSize;

        gp.obj[1] = new OBJ_Vape();
        gp.obj[1].worldX = 23 * gp.tileSize;
        gp.obj[1].worldY = 40 * gp.tileSize;

        gp.obj[2] = new OBJ_Vape();
        gp.obj[2].worldX = 24 * gp.tileSize;
        gp.obj[2].worldY = 40 * gp.tileSize;

        gp.obj[3] = new OBJ_Door();
        gp.obj[3].worldX = 12 * gp.tileSize;
        gp.obj[3].worldY = 24 * gp.tileSize;

        gp.obj[4] = new OBJ_Door();
        gp.obj[4].worldX = 8 * gp.tileSize;
        gp.obj[4].worldY = 24 * gp.tileSize;


    }

}

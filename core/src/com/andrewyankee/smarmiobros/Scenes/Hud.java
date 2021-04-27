package com.andrewyankee.smarmiobros.Scenes;

import com.andrewyankee.smarmiobros.SmarmioBros;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.badlogic.gdx.scenes.scene2d.ui.Label;



public class Hud {
    public Stage stage;
    private Viewport viewport;

    private Integer worldTimer;
    private float timeCount;
    private Integer score;

    Label countdownLabel;
    Label scoreLabel;
    Label timeLabel;
    Label levelLabel;
    Label worldLabel;
    Label smarmioLabel;

    public Hud(SpriteBatch sb) {
        worldTimer = 300;
        timeCount = 0;
        score = 0;

        viewport = new FitViewport(SmarmioBros.V_WIDTH, SmarmioBros.V_HEIGHT, new OrthographicCamera());
        //stage is an empty box holding widgets
        //set up table inside of stage to organize
        stage = new Stage(viewport, sb);
        Table table = new Table();
        table.top();
        //set table to size of stage
        table.setFillParent(true);

        countdownLabel = new Label(String.format("%03d", worldTimer), new com.badlogic.gdx.scenes.scene2d.ui.Label());

    }
}

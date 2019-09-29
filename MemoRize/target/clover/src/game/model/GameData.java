/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package game.model;

import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class GameData {public static class __CLR4_3_15l5lk159ir1c{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0049\u0073\u0074\u0076\u00e1\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0073\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u0074\u0065\u0073\u007a\u0074\u005c\u005c\u004d\u0065\u006d\u006f\u0052\u0069\u007a\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1569778386035L,8589935092L,274,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private Stage gameStage;

    private Group mainGroup;
    private Scene mainScene;
    private Button[] buttons;
    private Boolean[] haveToPress;
    private int[] haveToPress2;
    private Button start;
    private int eltalalt;
    private int elrontott;
    private int db;
    private int n_edik_proba;
    private int level;
    private int wait;
    private float allflash;
    private float success;
    private long starttime;
    private long endtime;


    public GameData(){try{__CLR4_3_15l5lk159ir1c.R.inc(201);

    }finally{__CLR4_3_15l5lk159ir1c.R.flushNeeded();}}

    public void setGameStage(Stage gameStage) {try{__CLR4_3_15l5lk159ir1c.R.inc(202);
        __CLR4_3_15l5lk159ir1c.R.inc(203);this.gameStage = gameStage;
    }finally{__CLR4_3_15l5lk159ir1c.R.flushNeeded();}}

    public Stage getGameStage() {try{__CLR4_3_15l5lk159ir1c.R.inc(204);
        __CLR4_3_15l5lk159ir1c.R.inc(205);return gameStage;
    }finally{__CLR4_3_15l5lk159ir1c.R.flushNeeded();}}

    public Scene menuView(){try{__CLR4_3_15l5lk159ir1c.R.inc(206);
        __CLR4_3_15l5lk159ir1c.R.inc(207);Group group= new Group();
        __CLR4_3_15l5lk159ir1c.R.inc(208);Scene main= new Scene(group,600,400);

        __CLR4_3_15l5lk159ir1c.R.inc(209);return main;
    }finally{__CLR4_3_15l5lk159ir1c.R.flushNeeded();}}

    public Group getMainGroup() {try{__CLR4_3_15l5lk159ir1c.R.inc(210);
        __CLR4_3_15l5lk159ir1c.R.inc(211);return mainGroup;
    }finally{__CLR4_3_15l5lk159ir1c.R.flushNeeded();}}

    public void setMainGroup(Group mainGroup) {try{__CLR4_3_15l5lk159ir1c.R.inc(212);
        __CLR4_3_15l5lk159ir1c.R.inc(213);this.mainGroup = mainGroup;
    }finally{__CLR4_3_15l5lk159ir1c.R.flushNeeded();}}

    public Scene getMainScene() {try{__CLR4_3_15l5lk159ir1c.R.inc(214);
        __CLR4_3_15l5lk159ir1c.R.inc(215);return mainScene;
    }finally{__CLR4_3_15l5lk159ir1c.R.flushNeeded();}}

    public void setMainScene(Scene mainScene) {try{__CLR4_3_15l5lk159ir1c.R.inc(216);
        __CLR4_3_15l5lk159ir1c.R.inc(217);this.mainScene = mainScene;
    }finally{__CLR4_3_15l5lk159ir1c.R.flushNeeded();}}

    public Button[] getButtons() {try{__CLR4_3_15l5lk159ir1c.R.inc(218);
        __CLR4_3_15l5lk159ir1c.R.inc(219);return buttons;
    }finally{__CLR4_3_15l5lk159ir1c.R.flushNeeded();}}

    public void setButtons(Button[] buttons) {try{__CLR4_3_15l5lk159ir1c.R.inc(220);
        __CLR4_3_15l5lk159ir1c.R.inc(221);this.buttons = buttons;
    }finally{__CLR4_3_15l5lk159ir1c.R.flushNeeded();}}

    public Boolean[] getHaveToPress() {try{__CLR4_3_15l5lk159ir1c.R.inc(222);
        __CLR4_3_15l5lk159ir1c.R.inc(223);return haveToPress;
    }finally{__CLR4_3_15l5lk159ir1c.R.flushNeeded();}}

    public void setHaveToPress(Boolean[] haveToPress) {try{__CLR4_3_15l5lk159ir1c.R.inc(224);
        __CLR4_3_15l5lk159ir1c.R.inc(225);this.haveToPress = haveToPress;
    }finally{__CLR4_3_15l5lk159ir1c.R.flushNeeded();}}

    public Button getStart() {try{__CLR4_3_15l5lk159ir1c.R.inc(226);
        __CLR4_3_15l5lk159ir1c.R.inc(227);return start;
    }finally{__CLR4_3_15l5lk159ir1c.R.flushNeeded();}}

    public void setStart(Button start) {try{__CLR4_3_15l5lk159ir1c.R.inc(228);
        __CLR4_3_15l5lk159ir1c.R.inc(229);this.start = start;
    }finally{__CLR4_3_15l5lk159ir1c.R.flushNeeded();}}

    public int getEltalalt() {try{__CLR4_3_15l5lk159ir1c.R.inc(230);
        __CLR4_3_15l5lk159ir1c.R.inc(231);return eltalalt;
    }finally{__CLR4_3_15l5lk159ir1c.R.flushNeeded();}}

    public void setEltalalt(int eltalalt) {try{__CLR4_3_15l5lk159ir1c.R.inc(232);
        __CLR4_3_15l5lk159ir1c.R.inc(233);this.eltalalt = eltalalt;
    }finally{__CLR4_3_15l5lk159ir1c.R.flushNeeded();}}

    public int getElrontott() {try{__CLR4_3_15l5lk159ir1c.R.inc(234);
        __CLR4_3_15l5lk159ir1c.R.inc(235);return elrontott;
    }finally{__CLR4_3_15l5lk159ir1c.R.flushNeeded();}}

    public void setElrontott(int elrontott) {try{__CLR4_3_15l5lk159ir1c.R.inc(236);
        __CLR4_3_15l5lk159ir1c.R.inc(237);this.elrontott = elrontott;
    }finally{__CLR4_3_15l5lk159ir1c.R.flushNeeded();}}

    public int getDb() {try{__CLR4_3_15l5lk159ir1c.R.inc(238);
        __CLR4_3_15l5lk159ir1c.R.inc(239);return db;
    }finally{__CLR4_3_15l5lk159ir1c.R.flushNeeded();}}

    public void setDb(int db) {try{__CLR4_3_15l5lk159ir1c.R.inc(240);
        __CLR4_3_15l5lk159ir1c.R.inc(241);this.db = db;
    }finally{__CLR4_3_15l5lk159ir1c.R.flushNeeded();}}

    public int getN_edik_proba() {try{__CLR4_3_15l5lk159ir1c.R.inc(242);
        __CLR4_3_15l5lk159ir1c.R.inc(243);return n_edik_proba;
    }finally{__CLR4_3_15l5lk159ir1c.R.flushNeeded();}}

    public void setN_edik_proba(int n_edik_proba) {try{__CLR4_3_15l5lk159ir1c.R.inc(244);
        __CLR4_3_15l5lk159ir1c.R.inc(245);this.n_edik_proba = n_edik_proba;
    }finally{__CLR4_3_15l5lk159ir1c.R.flushNeeded();}}

    public int[] getHaveToPress2() {try{__CLR4_3_15l5lk159ir1c.R.inc(246);
        __CLR4_3_15l5lk159ir1c.R.inc(247);return haveToPress2;
    }finally{__CLR4_3_15l5lk159ir1c.R.flushNeeded();}}

    public void setHaveToPress2(int[] haveToPress2) {try{__CLR4_3_15l5lk159ir1c.R.inc(248);
        __CLR4_3_15l5lk159ir1c.R.inc(249);this.haveToPress2 = haveToPress2;
    }finally{__CLR4_3_15l5lk159ir1c.R.flushNeeded();}}

    public int getWait() {try{__CLR4_3_15l5lk159ir1c.R.inc(250);
        __CLR4_3_15l5lk159ir1c.R.inc(251);return wait;
    }finally{__CLR4_3_15l5lk159ir1c.R.flushNeeded();}}

    public void setWait(int wait) {try{__CLR4_3_15l5lk159ir1c.R.inc(252);
        __CLR4_3_15l5lk159ir1c.R.inc(253);this.wait = wait;
    }finally{__CLR4_3_15l5lk159ir1c.R.flushNeeded();}}

    public int getLevel() {try{__CLR4_3_15l5lk159ir1c.R.inc(254);
        __CLR4_3_15l5lk159ir1c.R.inc(255);return level;
    }finally{__CLR4_3_15l5lk159ir1c.R.flushNeeded();}}

    public void setLevel(int level) {try{__CLR4_3_15l5lk159ir1c.R.inc(256);
        __CLR4_3_15l5lk159ir1c.R.inc(257);this.level = level;
    }finally{__CLR4_3_15l5lk159ir1c.R.flushNeeded();}}

    public float getAllflash() {try{__CLR4_3_15l5lk159ir1c.R.inc(258);
        __CLR4_3_15l5lk159ir1c.R.inc(259);return allflash;
    }finally{__CLR4_3_15l5lk159ir1c.R.flushNeeded();}}

    public void setAllflash(float allflash) {try{__CLR4_3_15l5lk159ir1c.R.inc(260);
        __CLR4_3_15l5lk159ir1c.R.inc(261);this.allflash = allflash;
    }finally{__CLR4_3_15l5lk159ir1c.R.flushNeeded();}}

    public float getSuccess() {try{__CLR4_3_15l5lk159ir1c.R.inc(262);
        __CLR4_3_15l5lk159ir1c.R.inc(263);return success;
    }finally{__CLR4_3_15l5lk159ir1c.R.flushNeeded();}}

    public void setSuccess(float success) {try{__CLR4_3_15l5lk159ir1c.R.inc(264);
        __CLR4_3_15l5lk159ir1c.R.inc(265);this.success = success;
    }finally{__CLR4_3_15l5lk159ir1c.R.flushNeeded();}}

    public float getStarttime() {try{__CLR4_3_15l5lk159ir1c.R.inc(266);
        __CLR4_3_15l5lk159ir1c.R.inc(267);return starttime;
    }finally{__CLR4_3_15l5lk159ir1c.R.flushNeeded();}}

    public void setStarttime(long starttime) {try{__CLR4_3_15l5lk159ir1c.R.inc(268);
        __CLR4_3_15l5lk159ir1c.R.inc(269);this.starttime = starttime;
    }finally{__CLR4_3_15l5lk159ir1c.R.flushNeeded();}}

    public float getEndtime() {try{__CLR4_3_15l5lk159ir1c.R.inc(270);
        __CLR4_3_15l5lk159ir1c.R.inc(271);return endtime;
    }finally{__CLR4_3_15l5lk159ir1c.R.flushNeeded();}}

    public void setEndtime(long endtime) {try{__CLR4_3_15l5lk159ir1c.R.inc(272);
        __CLR4_3_15l5lk159ir1c.R.inc(273);this.endtime = endtime;
    }finally{__CLR4_3_15l5lk159ir1c.R.flushNeeded();}}
}

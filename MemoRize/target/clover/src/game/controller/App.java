/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package game.controller;

import game.model.GameData;
import game.model.PlayerData;
import game.model.PlayerStat;
import game.model.SQLPersistance;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.io.IOException;
import java.security.Key;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

@java.lang.SuppressWarnings({"fallthrough"}) public class App extends Application {public static class __CLR4_3_122k159iqzb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0049\u0073\u0074\u0076\u00e1\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0073\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u0074\u0065\u0073\u007a\u0074\u005c\u005c\u004d\u0065\u006d\u006f\u0052\u0069\u007a\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1569778386035L,8589935092L,201,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static GameData gameData = new GameData();
    public static PlayerData playerData = new PlayerData();
    public static PlayerStat playerStat = new PlayerStat();
    public static SQLPersistance sqlPersistance = new SQLPersistance();

    @FXML
    Button menuButton;

    @FXML
    Button exitButton;

    @FXML
    Button nextLevel;
    @FXML
    TextField nev;
    @FXML
    TextField kor;
    @FXML
    TextField nem;

    //a f\u0151men\u00fc gombja mit csin\u00e1ljon ha megnyomjuk
    @FXML
    private void menuAction(ActionEvent actionEvent) {try{__CLR4_3_122k159iqzb.R.inc(2);
        __CLR4_3_122k159iqzb.R.inc(3);sqlPersistance.openEntityManager();
        __CLR4_3_122k159iqzb.R.inc(4);playerData.setNev(nev.getText());
        __CLR4_3_122k159iqzb.R.inc(5);playerData.setKor(Integer.parseInt(kor.getText()));
        __CLR4_3_122k159iqzb.R.inc(6);playerData.setNem(nem.getText());
        __CLR4_3_122k159iqzb.R.inc(7);playerData.setKitoltes_ideje(Date.valueOf(LocalDate.now()));
        __CLR4_3_122k159iqzb.R.inc(8);sqlPersistance.insertPlayerData(playerData);
        __CLR4_3_122k159iqzb.R.inc(9);sqlPersistance.closeEntityManager();
        __CLR4_3_122k159iqzb.R.inc(10);gameData.setStarttime(System.currentTimeMillis());
        __CLR4_3_122k159iqzb.R.inc(11);changeScene("gameGUI");
        //A j\u00e1t\u00e9k megjelen\u00edt\u00e9se full screen-ben
        //gameData.getGameStage().setMaximized(true);
    }finally{__CLR4_3_122k159iqzb.R.flushNeeded();}}

    //a next level gomb mit csin\u00e1ljon ha megnyomjuk
    @FXML
    private void nextLevel(ActionEvent actionEvent){try{__CLR4_3_122k159iqzb.R.inc(12);
        __CLR4_3_122k159iqzb.R.inc(13);gameData.setAllflash(gameData.getAllflash() + gameData.getDb());
        __CLR4_3_122k159iqzb.R.inc(14);gameData.setSuccess(gameData.getSuccess() + gameData.getEltalalt());
        __CLR4_3_122k159iqzb.R.inc(15);gameData.setElrontott(0);
        __CLR4_3_122k159iqzb.R.inc(16);gameData.setEltalalt(0);
        __CLR4_3_122k159iqzb.R.inc(17);gameData.setN_edik_proba(0);
        __CLR4_3_122k159iqzb.R.inc(18);gameData.setWait(0);
        __CLR4_3_122k159iqzb.R.inc(19);alterTableHandler(gameData.getButtons());
        __CLR4_3_122k159iqzb.R.inc(20);try {
            __CLR4_3_122k159iqzb.R.inc(21);gameFunction(gameData.getDb());
        } catch (InterruptedException ex) {
            __CLR4_3_122k159iqzb.R.inc(22);ex.printStackTrace();
        }
    }finally{__CLR4_3_122k159iqzb.R.flushNeeded();}}

    //megkeresi az \u00f6sszes Node-ot egy Parent-en bel\u00fcl, \u00e9s kiv\u00e1lasztja csak azokat a Node-okat amik Button-ok
    public static List<Node> getAllButtons(List<Node> all_the_buttons, Parent parent) {try{__CLR4_3_122k159iqzb.R.inc(23);
        __CLR4_3_122k159iqzb.R.inc(24);List<Node> result = new LinkedList<>();
        __CLR4_3_122k159iqzb.R.inc(25);result.addAll(parent.getChildrenUnmodifiable().stream().collect(Collectors.toList()));
        __CLR4_3_122k159iqzb.R.inc(26);for (Node node: result) {{
            __CLR4_3_122k159iqzb.R.inc(27);if((((node instanceof Parent)&&(__CLR4_3_122k159iqzb.R.iget(28)!=0|true))||(__CLR4_3_122k159iqzb.R.iget(29)==0&false))){{
                __CLR4_3_122k159iqzb.R.inc(30);getAllButtons(all_the_buttons, (Parent) node);
            }
        }}
        }__CLR4_3_122k159iqzb.R.inc(31);all_the_buttons.addAll(result.stream().filter(e -> e instanceof Button).collect(Collectors.toList()));
        __CLR4_3_122k159iqzb.R.inc(32);return result;
    }finally{__CLR4_3_122k159iqzb.R.flushNeeded();}}

    //scene-t v\u00e1ltoztat
    public void changeScene(String scene){try{__CLR4_3_122k159iqzb.R.inc(33);
        boolean __CLB4_3_1_bool0=false;__CLR4_3_122k159iqzb.R.inc(34);switch (scene){
            case "menu":if (!__CLB4_3_1_bool0) {__CLR4_3_122k159iqzb.R.inc(35);__CLB4_3_1_bool0=true;} {
                //gameData.getGameStage().setMaximized(true);
                //f\u00e1jlbeolvas\u00e1s
                __CLR4_3_122k159iqzb.R.inc(36);Parent menu = null;
                __CLR4_3_122k159iqzb.R.inc(37);try { __CLR4_3_122k159iqzb.R.inc(38);menu = FXMLLoader.load(getClass().getResource("/fxml/sample.fxml"));
                } catch (IOException e) { __CLR4_3_122k159iqzb.R.inc(39);e.printStackTrace(); }
                __CLR4_3_122k159iqzb.R.inc(40);Platform.runLater(menu::requestFocus);
                //scene v\u00e1lt\u00e1s
                __CLR4_3_122k159iqzb.R.inc(41);gameData.getGameStage().setScene(new Scene(menu));
                //fejl\u00e9c elt\u00fcntet\u00e9se
                //gameData.getGameStage().initStyle(StageStyle.UNDECORATED);
                __CLR4_3_122k159iqzb.R.inc(42);break;
            }
            case "gameGUI":if (!__CLB4_3_1_bool0) {__CLR4_3_122k159iqzb.R.inc(43);__CLB4_3_1_bool0=true;} {
                //f\u00e1jl beolvas\u00e1s
                __CLR4_3_122k159iqzb.R.inc(44);Parent gameGUI = null;
                __CLR4_3_122k159iqzb.R.inc(45);try { __CLR4_3_122k159iqzb.R.inc(46);gameGUI = FXMLLoader.load(getClass().getResource("/fxml/gameGUI.fxml"));
                } catch (IOException e) { __CLR4_3_122k159iqzb.R.inc(47);e.printStackTrace(); }
                __CLR4_3_122k159iqzb.R.inc(48);Platform.runLater(gameGUI::requestFocus);
                //scene v\u00e1lt\u00e1s
                __CLR4_3_122k159iqzb.R.inc(49);gameData.getGameStage().setScene(new Scene(gameGUI));

                //megkeress\u00fck a gameGUI-n bel\u00fcl az \u00f6sszes gombot, berakjuk az all_the_buttons list\u00e1ba
                __CLR4_3_122k159iqzb.R.inc(50);List<Node> all_the_buttons = new LinkedList<>();
                __CLR4_3_122k159iqzb.R.inc(51);getAllButtons(all_the_buttons, gameGUI);

                //gameDataban csin\u00e1l v\u00e1ltoz\u00e1sokat
                __CLR4_3_122k159iqzb.R.inc(52);setUp();

                //az all_the buttons list\u00e1b\u00f3l egy t\u00f6mbbe rakjuk \u00e1t az \u00f6sszes gombot \u00e9s \u00e1tadjuk a GameData oszt\u00e1lynak
                __CLR4_3_122k159iqzb.R.inc(53);Button[] buttons = new Button[36];
                __CLR4_3_122k159iqzb.R.inc(54);for (int i = 0; (((i<36)&&(__CLR4_3_122k159iqzb.R.iget(55)!=0|true))||(__CLR4_3_122k159iqzb.R.iget(56)==0&false)); i++){{
                    __CLR4_3_122k159iqzb.R.inc(57);buttons[i] = (Button) all_the_buttons.get(i);
                }
                }__CLR4_3_122k159iqzb.R.inc(58);gameData.setButtons(buttons);
                __CLR4_3_122k159iqzb.R.inc(59);break;
            }
        }
    }finally{__CLR4_3_122k159iqzb.R.flushNeeded();}}

    public void start(Stage stage) throws InterruptedException, IOException {try{__CLR4_3_122k159iqzb.R.inc(60);
        //lementj\u00fck a stage-et hogy k\u00e9s\u0151bb tudjunk rajta scene-t cser\u00e9lni
        __CLR4_3_122k159iqzb.R.inc(61);gameData.setGameStage(stage);
        //alapb\u00f3l a men\u00fc j\u00f6jj\u00f6n be
        __CLR4_3_122k159iqzb.R.inc(62);changeScene("menu");
        //title \u00e9s  stage megjelen\u00edt\u00e9s
        __CLR4_3_122k159iqzb.R.inc(63);gameData.getGameStage().setTitle("MemoRize");
        __CLR4_3_122k159iqzb.R.inc(64);stage.show();
    }finally{__CLR4_3_122k159iqzb.R.flushNeeded();}}

    @FXML
    private void exitGame(){try{__CLR4_3_122k159iqzb.R.inc(65);
        __CLR4_3_122k159iqzb.R.inc(66);sqlPersistance.openEntityManager();
        /*playerStat.setUser_id(sqlPersistance.readIdFromPlayerData());
        playerStat.setXp_lvl(gameData.getLevel());
        playerStat.setGame_time((int) (gameData.getEndtime() - gameData.getStarttime()));
        playerStat.setHit_rate(gameData.getSuccess()/gameData.getAllflash());
        sqlPersistance.insertPlayerStat(playerStat);
        sqlPersistance.closeEntityManager();
        gameData.setEndtime(System.currentTimeMillis());*/
        __CLR4_3_122k159iqzb.R.inc(67);System.out.println(gameData.getEndtime());
        __CLR4_3_122k159iqzb.R.inc(68);System.out.println(gameData.getStarttime());
        __CLR4_3_122k159iqzb.R.inc(69);System.out.println(gameData.getEndtime()- gameData.getStarttime());
        __CLR4_3_122k159iqzb.R.inc(70);System.out.println(gameData.getSuccess());
        __CLR4_3_122k159iqzb.R.inc(71);System.out.println(gameData.getAllflash());
        __CLR4_3_122k159iqzb.R.inc(72);gameData.getGameStage().close();
    }finally{__CLR4_3_122k159iqzb.R.flushNeeded();}}

    //felsetupolja a scene-t, valamint n\u00e9h\u00e1ny egy\u00e9bb v\u00e1ltoz\u00f3t
    public void setUp(){try{__CLR4_3_122k159iqzb.R.inc(73);
        __CLR4_3_122k159iqzb.R.inc(74);gameData.setHaveToPress(new Boolean[36]);
        __CLR4_3_122k159iqzb.R.inc(75);gameData.setHaveToPress2(new int[36]);
        __CLR4_3_122k159iqzb.R.inc(76);allFalse();
        __CLR4_3_122k159iqzb.R.inc(77);gameData.setElrontott(0);
        __CLR4_3_122k159iqzb.R.inc(78);gameData.setEltalalt(0);
        __CLR4_3_122k159iqzb.R.inc(79);gameData.setDb(3);
        __CLR4_3_122k159iqzb.R.inc(80);gameData.setN_edik_proba(0);

        __CLR4_3_122k159iqzb.R.inc(81);if ((((gameData.getDb()==0)&&(__CLR4_3_122k159iqzb.R.iget(82)!=0|true))||(__CLR4_3_122k159iqzb.R.iget(83)==0&false))) {{
            __CLR4_3_122k159iqzb.R.inc(84);gameData.setDb(3);
        }
        }__CLR4_3_122k159iqzb.R.inc(85);if ((((gameData.getLevel()==0)&&(__CLR4_3_122k159iqzb.R.iget(86)!=0|true))||(__CLR4_3_122k159iqzb.R.iget(87)==0&false))){{
            __CLR4_3_122k159iqzb.R.inc(88);gameData.setLevel(1);
        }
    }}finally{__CLR4_3_122k159iqzb.R.flushNeeded();}}

    public void gameFunction(int db) throws InterruptedException {try{__CLR4_3_122k159iqzb.R.inc(89);
        __CLR4_3_122k159iqzb.R.inc(90);allFalse();
        __CLR4_3_122k159iqzb.R.inc(91);allDisable();
        __CLR4_3_122k159iqzb.R.inc(92);Random random = new Random();
        __CLR4_3_122k159iqzb.R.inc(93);ArrayList<Integer> randomnumbers = new ArrayList<Integer>();
        __CLR4_3_122k159iqzb.R.inc(94);int rand;
        __CLR4_3_122k159iqzb.R.inc(95);int i=0;
        __CLR4_3_122k159iqzb.R.inc(96);Timeline timeline = new Timeline(
                new KeyFrame(Duration.millis(200), event -> {
                    __CLR4_3_122k159iqzb.R.inc(97);changeToGreen(gameData.getButtons()[randomnumbers.get(0)]);
                    __CLR4_3_122k159iqzb.R.inc(98);gameData.getHaveToPress()[randomnumbers.get(0)]=true;
                    //System.out.println(randomnumbers.get(0));
                }),
                new KeyFrame(Duration.millis(1200), event -> {
                    __CLR4_3_122k159iqzb.R.inc(99);changeToGray(gameData.getButtons()[randomnumbers.get(0)]);
                    __CLR4_3_122k159iqzb.R.inc(100);randomnumbers.remove(0);
                    __CLR4_3_122k159iqzb.R.inc(101);gameData.setWait(gameData.getWait()+1);
                    __CLR4_3_122k159iqzb.R.inc(102);System.out.println(gameData.getWait());
                    __CLR4_3_122k159iqzb.R.inc(103);if ((((gameData.getWait()==gameData.getDb())&&(__CLR4_3_122k159iqzb.R.iget(104)!=0|true))||(__CLR4_3_122k159iqzb.R.iget(105)==0&false))){{
                        __CLR4_3_122k159iqzb.R.inc(106);tableHandler(gameData.getButtons());
                    }
                }})
        );
        __CLR4_3_122k159iqzb.R.inc(107);timeline.setCycleCount(db);

        __CLR4_3_122k159iqzb.R.inc(108);while (true){{
            __CLR4_3_122k159iqzb.R.inc(109);rand = random.nextInt(36);
            __CLR4_3_122k159iqzb.R.inc(110);while ((((gameData.getHaveToPress()[rand])&&(__CLR4_3_122k159iqzb.R.iget(111)!=0|true))||(__CLR4_3_122k159iqzb.R.iget(112)==0&false))){{
                __CLR4_3_122k159iqzb.R.inc(113);rand = random.nextInt(36);
            }
            }__CLR4_3_122k159iqzb.R.inc(114);gameData.getHaveToPress()[rand]=true;
            __CLR4_3_122k159iqzb.R.inc(115);gameData.getHaveToPress2()[i]=rand;
            __CLR4_3_122k159iqzb.R.inc(116);randomnumbers.add(rand);
            __CLR4_3_122k159iqzb.R.inc(117);i++;
            __CLR4_3_122k159iqzb.R.inc(118);if((((i == db)&&(__CLR4_3_122k159iqzb.R.iget(119)!=0|true))||(__CLR4_3_122k159iqzb.R.iget(120)==0&false))){{
                __CLR4_3_122k159iqzb.R.inc(121);break;
            }
        }}
        }__CLR4_3_122k159iqzb.R.inc(122);timeline.play();
    }finally{__CLR4_3_122k159iqzb.R.flushNeeded();}}
    public void changeToGreen(Button button){try{__CLR4_3_122k159iqzb.R.inc(123);
        __CLR4_3_122k159iqzb.R.inc(124);button.setStyle("-fx-background-color: #00ff00; ");
    }finally{__CLR4_3_122k159iqzb.R.flushNeeded();}}
    public void changeToGray(Button button){try{__CLR4_3_122k159iqzb.R.inc(125);
        __CLR4_3_122k159iqzb.R.inc(126);button.setStyle("-fx-background-color: #808080; ");
    }finally{__CLR4_3_122k159iqzb.R.flushNeeded();}}
    public void changeToRed(Button button){try{__CLR4_3_122k159iqzb.R.inc(127);
        __CLR4_3_122k159iqzb.R.inc(128);button.setStyle("-fx-background-color: #ff0000; ");
    }finally{__CLR4_3_122k159iqzb.R.flushNeeded();}}

    public static void main(String[] args) {try{__CLR4_3_122k159iqzb.R.inc(129);
        //////////////////////////////////////////////////////
        //ezt kell majd berakni az exit game gomb eventj\u00e9nek//
        //////////////////////////////////////////////////////
        /*sqlPersistance.openEntityManager();
        playerStat.setUser_id(sqlPersistance.readIdFromPlayerData());
        playerStat.setXp_lvl(7);
        playerStat.setGame_time(300);
        playerStat.setHit_rate(1);
        sqlPersistance.insertPlayerStat(playerStat);
        sqlPersistance.closeEntityManager();*/

        __CLR4_3_122k159iqzb.R.inc(130);launch(args);
    }finally{__CLR4_3_122k159iqzb.R.flushNeeded();}}

    //A t\u00e1bla kezel\u00e9s\u00e9\u00e9rt felel
    public void tableHandler(Button[] buttons){try{__CLR4_3_122k159iqzb.R.inc(131);
        __CLR4_3_122k159iqzb.R.inc(132);for (int i=0; (((i<buttons.length)&&(__CLR4_3_122k159iqzb.R.iget(133)!=0|true))||(__CLR4_3_122k159iqzb.R.iget(134)==0&false)); i++){{
            __CLR4_3_122k159iqzb.R.inc(135);final int j=i;
            __CLR4_3_122k159iqzb.R.inc(136);buttons[i].setOnAction(event->buttonHandler(buttons[j]));
        }
    }}finally{__CLR4_3_122k159iqzb.R.flushNeeded();}}

    public void alterTableHandler(Button[] buttons){try{__CLR4_3_122k159iqzb.R.inc(137);
        __CLR4_3_122k159iqzb.R.inc(138);for (int i=0; (((i<buttons.length)&&(__CLR4_3_122k159iqzb.R.iget(139)!=0|true))||(__CLR4_3_122k159iqzb.R.iget(140)==0&false)); i++){{
            __CLR4_3_122k159iqzb.R.inc(141);final int j=i;
            __CLR4_3_122k159iqzb.R.inc(142);buttons[i].setOnAction(event->{});
        }
    }}finally{__CLR4_3_122k159iqzb.R.flushNeeded();}}

    //A gombok kezel\u00e9s\u00e9\u00e9rt felel a t\u00e1bl\u00e1n
    public void buttonHandler(Button button){try{__CLR4_3_122k159iqzb.R.inc(143);
        __CLR4_3_122k159iqzb.R.inc(144);int id=Integer.parseInt(button.getId());
        __CLR4_3_122k159iqzb.R.inc(145);gameData.setN_edik_proba(gameData.getN_edik_proba()+1);

        //System.out.println("n-edik proba: "+gameData.getN_edik_proba());
        //System.out.println("ennyiszer kell kattintani: "+gameData.getDb());
        __CLR4_3_122k159iqzb.R.inc(146);if ((((gameData.getN_edik_proba()<=gameData.getDb())&&(__CLR4_3_122k159iqzb.R.iget(147)!=0|true))||(__CLR4_3_122k159iqzb.R.iget(148)==0&false))) {{
            __CLR4_3_122k159iqzb.R.inc(149);Timeline timeline = new Timeline(
                    new KeyFrame(Duration.millis(20), event -> {
                        //System.out.println("Az adott elem sorsz\u00e1ma: "+id);
                        //if (gameData.getHaveToPress()[id]) {
                        __CLR4_3_122k159iqzb.R.inc(150);if ((((gameData.getHaveToPress2()[gameData.getN_edik_proba()-1]==id)&&(__CLR4_3_122k159iqzb.R.iget(151)!=0|true))||(__CLR4_3_122k159iqzb.R.iget(152)==0&false))){{
                            __CLR4_3_122k159iqzb.R.inc(153);changeToGreen(gameData.getButtons()[id]);
                            __CLR4_3_122k159iqzb.R.inc(154);gameData.setEltalalt(gameData.getEltalalt() + 1);
                            //System.out.println("Eltal\u00e1ltad");

                        } }else {{
                            __CLR4_3_122k159iqzb.R.inc(155);changeToRed(gameData.getButtons()[id]);
                            __CLR4_3_122k159iqzb.R.inc(156);gameData.setElrontott(gameData.getElrontott() + 1);
                            //System.out.println("Elrontottad");
                        }
                        }__CLR4_3_122k159iqzb.R.inc(157);if ((((gameData.getN_edik_proba()==gameData.getDb())&&(__CLR4_3_122k159iqzb.R.iget(158)!=0|true))||(__CLR4_3_122k159iqzb.R.iget(159)==0&false))){{
                            __CLR4_3_122k159iqzb.R.inc(160);result();
                            __CLR4_3_122k159iqzb.R.inc(161);if ((((gameData.getEltalalt()==gameData.getDb())&&(__CLR4_3_122k159iqzb.R.iget(162)!=0|true))||(__CLR4_3_122k159iqzb.R.iget(163)==0&false))){{
                                __CLR4_3_122k159iqzb.R.inc(164);gameData.setLevel(gameData.getLevel()+1);
                                __CLR4_3_122k159iqzb.R.inc(165);gameData.setDb(gameData.getDb()+1);
                            }}else{{
                                __CLR4_3_122k159iqzb.R.inc(166);gameData.setSuccess(gameData.getSuccess() + gameData.getEltalalt());
                            }
                        }}
                    }}),
                    new KeyFrame(Duration.millis(800), event -> {
                        __CLR4_3_122k159iqzb.R.inc(167);changeToGray(gameData.getButtons()[id]);
                    })
            );
            __CLR4_3_122k159iqzb.R.inc(168);timeline.play();
        }
    }}finally{__CLR4_3_122k159iqzb.R.flushNeeded();}}

    //ezt a r\u00e9szt fogja felv\u00e1ltani a view, jelenleg csak sablonk\u00e9nt haszn\u00e1l egy k\u00e9zzel setupolt gombot
    public Button[] gombolo(){try{__CLR4_3_122k159iqzb.R.inc(169);
        __CLR4_3_122k159iqzb.R.inc(170);Button[] buttons = new Button[36];
        __CLR4_3_122k159iqzb.R.inc(171);for (int i = 0; (((i <buttons.length )&&(__CLR4_3_122k159iqzb.R.iget(172)!=0|true))||(__CLR4_3_122k159iqzb.R.iget(173)==0&false)); i++) {{
            __CLR4_3_122k159iqzb.R.inc(174);buttons[i] = new Button();
            __CLR4_3_122k159iqzb.R.inc(175);buttons[i].setLayoutX(30*(i%6));
            __CLR4_3_122k159iqzb.R.inc(176);buttons[i].setLayoutY(30*(i/6));
            __CLR4_3_122k159iqzb.R.inc(177);buttons[i].setMinSize(25, 25);
            __CLR4_3_122k159iqzb.R.inc(178);buttons[i].setId(Integer.toString(i));
            __CLR4_3_122k159iqzb.R.inc(179);buttons[i].setStyle("-fx-background-color: #808080 ");
        }
        }__CLR4_3_122k159iqzb.R.inc(180);return buttons;
    }finally{__CLR4_3_122k159iqzb.R.flushNeeded();}}

    //be\u00e1ll\u00edtja azt, hogy egyik gomb sincs megnyomva
    public void allFalse(){try{__CLR4_3_122k159iqzb.R.inc(181);
        __CLR4_3_122k159iqzb.R.inc(182);for (int i = 0; (((i <36 )&&(__CLR4_3_122k159iqzb.R.iget(183)!=0|true))||(__CLR4_3_122k159iqzb.R.iget(184)==0&false)); i++) {{
            __CLR4_3_122k159iqzb.R.inc(185);gameData.getHaveToPress()[i]=false;
        }
    }}finally{__CLR4_3_122k159iqzb.R.flushNeeded();}}
    public void allDisable(){try{__CLR4_3_122k159iqzb.R.inc(186);
        __CLR4_3_122k159iqzb.R.inc(187);for (int i = 0; (((i <gameData.getButtons().length )&&(__CLR4_3_122k159iqzb.R.iget(188)!=0|true))||(__CLR4_3_122k159iqzb.R.iget(189)==0&false)); i++) {{
            __CLR4_3_122k159iqzb.R.inc(190);gameData.getButtons()[i].setStyle("-fx-background-color: #808080 ");
        }
    }}finally{__CLR4_3_122k159iqzb.R.flushNeeded();}}

    //ki\u00edrja az \u00f6sszes gomb \u00e1llapot\u00e1t(meg kell nyomni vagy sem)
    public void kiir(){try{__CLR4_3_122k159iqzb.R.inc(191);
        __CLR4_3_122k159iqzb.R.inc(192);for (int i = 0; (((i <gameData.getHaveToPress().length )&&(__CLR4_3_122k159iqzb.R.iget(193)!=0|true))||(__CLR4_3_122k159iqzb.R.iget(194)==0&false)); i++) {{
            __CLR4_3_122k159iqzb.R.inc(195);System.out.println(gameData.getHaveToPress()[i]);
        }
    }}finally{__CLR4_3_122k159iqzb.R.flushNeeded();}}

    public void result(){try{__CLR4_3_122k159iqzb.R.inc(196);
        __CLR4_3_122k159iqzb.R.inc(197);System.out.println("Eltal\u00e1ltak sz\u00e1ma: "+gameData.getEltalalt());
        __CLR4_3_122k159iqzb.R.inc(198);System.out.println("Elrontottak sz\u00e1ma: "+gameData.getElrontott());
        __CLR4_3_122k159iqzb.R.inc(199);System.out.println("Teljes\u00edtm\u00e9ny: "+(int)((gameData.getEltalalt()/(double)gameData.getDb())*100)+"%");
        __CLR4_3_122k159iqzb.R.inc(200);System.out.println("Az \u00e1ltalad el\u00e9rt szint: "+gameData.getLevel());
    }finally{__CLR4_3_122k159iqzb.R.flushNeeded();}}

}

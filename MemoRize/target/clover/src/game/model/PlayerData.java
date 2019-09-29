/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package game.model;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "felhasznalo_adatai")
public class PlayerData {public static class __CLR4_3_19j9jk159q4ye{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0049\u0073\u0074\u0076\u00e1\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0073\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u0074\u0065\u0073\u007a\u0074\u005c\u005c\u004d\u0065\u006d\u006f\u0052\u0069\u007a\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1569778730862L,8589935092L,369,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Id
    private int user_id;
    @Column(name = "nev")
    private String nev;
    @Column(name = "kor")
    private int kor;
    @Column(name = "nem")
    private String nem;
    @Column(name = "kitoltes_ideje")
    private Date kitoltes_ideje;

    public void setNev(String nev) {try{__CLR4_3_19j9jk159q4ye.R.inc(343); __CLR4_3_19j9jk159q4ye.R.inc(344);this.nev = nev; }finally{__CLR4_3_19j9jk159q4ye.R.flushNeeded();}}
    public void setKor(int kor) {try{__CLR4_3_19j9jk159q4ye.R.inc(345); __CLR4_3_19j9jk159q4ye.R.inc(346);this.kor = kor; }finally{__CLR4_3_19j9jk159q4ye.R.flushNeeded();}}
    public void setNem(String nem) {try{__CLR4_3_19j9jk159q4ye.R.inc(347); __CLR4_3_19j9jk159q4ye.R.inc(348);this.nem = nem; }finally{__CLR4_3_19j9jk159q4ye.R.flushNeeded();}}
    public void setKitoltes_ideje(Date kitoltes_ideje) {try{__CLR4_3_19j9jk159q4ye.R.inc(349); __CLR4_3_19j9jk159q4ye.R.inc(350);this.kitoltes_ideje = kitoltes_ideje; }finally{__CLR4_3_19j9jk159q4ye.R.flushNeeded();}}

    public boolean isvalidName(String nev) {try{__CLR4_3_19j9jk159q4ye.R.inc(351);
        __CLR4_3_19j9jk159q4ye.R.inc(352);if ((((nev.matches("[a-zA-Z]+"))&&(__CLR4_3_19j9jk159q4ye.R.iget(353)!=0|true))||(__CLR4_3_19j9jk159q4ye.R.iget(354)==0&false))) {{
            __CLR4_3_19j9jk159q4ye.R.inc(355);return true;
        } }else {{
            __CLR4_3_19j9jk159q4ye.R.inc(356);return false;
        }
    }}finally{__CLR4_3_19j9jk159q4ye.R.flushNeeded();}}

    public boolean isvalidAge (String nev) {try{__CLR4_3_19j9jk159q4ye.R.inc(357);
        __CLR4_3_19j9jk159q4ye.R.inc(358);if ((((nev.matches("[0-9]*"))&&(__CLR4_3_19j9jk159q4ye.R.iget(359)!=0|true))||(__CLR4_3_19j9jk159q4ye.R.iget(360)==0&false))) {{
            __CLR4_3_19j9jk159q4ye.R.inc(361);return true;
        } }else {{
            __CLR4_3_19j9jk159q4ye.R.inc(362);return false;
        }
    }}finally{__CLR4_3_19j9jk159q4ye.R.flushNeeded();}}

    public boolean isvalidGender(String nev) {try{__CLR4_3_19j9jk159q4ye.R.inc(363);
        __CLR4_3_19j9jk159q4ye.R.inc(364);if ((((nev.matches("[a-zA-Z]+"))&&(__CLR4_3_19j9jk159q4ye.R.iget(365)!=0|true))||(__CLR4_3_19j9jk159q4ye.R.iget(366)==0&false))) {{
            __CLR4_3_19j9jk159q4ye.R.inc(367);return true;
        } }else {{
            __CLR4_3_19j9jk159q4ye.R.inc(368);return false;
        }
    }}finally{__CLR4_3_19j9jk159q4ye.R.flushNeeded();}}

}

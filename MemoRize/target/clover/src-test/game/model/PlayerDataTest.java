/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package game.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerDataTest {static class __CLR4_3_1a9a9k159su59{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0049\u0073\u0074\u0076\u00e1\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0073\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u0074\u0065\u0073\u007a\u0074\u005c\u005c\u004d\u0065\u006d\u006f\u0052\u0069\u007a\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1569778856807L,8589935092L,387,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    void isvalidName() {try{__CLR4_3_1a9a9k159su59.R.inc(369);
        __CLR4_3_1a9a9k159su59.R.inc(370);PlayerData playerData = new PlayerData();
        __CLR4_3_1a9a9k159su59.R.inc(371);assertEquals(true, playerData.isvalidName("abcd"));
        __CLR4_3_1a9a9k159su59.R.inc(372);assertEquals(true, playerData.isvalidName("qwerty"));
        __CLR4_3_1a9a9k159su59.R.inc(373);assertEquals(false, playerData.isvalidName("1qwerty"));
        __CLR4_3_1a9a9k159su59.R.inc(374);assertEquals(false, playerData.isvalidName("$qwerty"));
    }finally{__CLR4_3_1a9a9k159su59.R.flushNeeded();}}

    @Test
    void isvalidAge() {try{__CLR4_3_1a9a9k159su59.R.inc(375);
        __CLR4_3_1a9a9k159su59.R.inc(376);PlayerData playerData = new PlayerData();
        __CLR4_3_1a9a9k159su59.R.inc(377);assertEquals(true, playerData.isvalidAge("42345"));
        __CLR4_3_1a9a9k159su59.R.inc(378);assertEquals(true, playerData.isvalidAge("000456"));
        __CLR4_3_1a9a9k159su59.R.inc(379);assertEquals(false, playerData.isvalidAge("1qwerty"));
        __CLR4_3_1a9a9k159su59.R.inc(380);assertEquals(false, playerData.isvalidAge("$qwerty"));
    }finally{__CLR4_3_1a9a9k159su59.R.flushNeeded();}}

    @Test
    void isvalidGender() {try{__CLR4_3_1a9a9k159su59.R.inc(381);
        __CLR4_3_1a9a9k159su59.R.inc(382);PlayerData playerData = new PlayerData();
        __CLR4_3_1a9a9k159su59.R.inc(383);assertEquals(true, playerData.isvalidGender("abcd"));
        __CLR4_3_1a9a9k159su59.R.inc(384);assertEquals(true, playerData.isvalidGender("qwerty"));
        __CLR4_3_1a9a9k159su59.R.inc(385);assertEquals(false, playerData.isvalidGender("1qwerty"));
        __CLR4_3_1a9a9k159su59.R.inc(386);assertEquals(false, playerData.isvalidGender("$qwerty"));
    }finally{__CLR4_3_1a9a9k159su59.R.flushNeeded();}}
}
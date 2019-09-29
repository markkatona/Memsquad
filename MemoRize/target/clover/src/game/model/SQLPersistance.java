/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package game.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class SQLPersistance {public static class __CLR4_3_18k8kk159ir38{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0049\u0073\u0074\u0076\u00e1\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0073\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u0074\u0065\u0073\u007a\u0074\u005c\u005c\u004d\u0065\u006d\u006f\u0052\u0069\u007a\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1569778386035L,8589935092L,325,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private EntityManagerFactory emf;
    private EntityManager em;

    //megnyitja az entity managert
    public void openEntityManager(){try{__CLR4_3_18k8kk159ir38.R.inc(308);
        __CLR4_3_18k8kk159ir38.R.inc(309);this.emf = Persistence.createEntityManagerFactory("jpa-persistence-unit-1");
        __CLR4_3_18k8kk159ir38.R.inc(310);this.em = emf.createEntityManager();
    }finally{__CLR4_3_18k8kk159ir38.R.flushNeeded();}}
    //bez\u00e1rja az entity managert
    public void closeEntityManager(){try{__CLR4_3_18k8kk159ir38.R.inc(311);
        __CLR4_3_18k8kk159ir38.R.inc(312);em.close();
        __CLR4_3_18k8kk159ir38.R.inc(313);emf.close();
    }finally{__CLR4_3_18k8kk159ir38.R.flushNeeded();}}
    //felt\u00f6lti a j\u00e1t\u00e9kos szem\u00e9lyes adatait az adatb\u00e1zis "felhasznalo_adatai" t\u00e1bl\u00e1j\u00e1ba
    public void insertPlayerData(PlayerData playerData){try{__CLR4_3_18k8kk159ir38.R.inc(314);
        __CLR4_3_18k8kk159ir38.R.inc(315);em.getTransaction().begin();
        __CLR4_3_18k8kk159ir38.R.inc(316);em.persist(playerData);
        __CLR4_3_18k8kk159ir38.R.inc(317);em.getTransaction().commit();
    }finally{__CLR4_3_18k8kk159ir38.R.flushNeeded();}}
    //felt\u00f6lti a j\u00e1t\u00e9kos statisztikai adatait az adatb\u00e1zis "statisztika" t\u00e1bl\u00e1j\u00e1ba
    public void insertPlayerStat(PlayerStat playerStat){try{__CLR4_3_18k8kk159ir38.R.inc(318);
        __CLR4_3_18k8kk159ir38.R.inc(319);em.getTransaction().begin();
        __CLR4_3_18k8kk159ir38.R.inc(320);em.persist(playerStat);
        __CLR4_3_18k8kk159ir38.R.inc(321);em.getTransaction().commit();
    }finally{__CLR4_3_18k8kk159ir38.R.flushNeeded();}}
    //kiolvassa a legut\u00f3bb beillesztett sor id-j\u00e1t a "felhasznalo_adatai" t\u00e1bl\u00e1b\u00f3l
    public int readIdFromPlayerData(){try{__CLR4_3_18k8kk159ir38.R.inc(322);
        __CLR4_3_18k8kk159ir38.R.inc(323);Query q = em.createNativeQuery("SELECT fa.user_id FROM felhasznalo_adatai fa");
        __CLR4_3_18k8kk159ir38.R.inc(324);return ((int) q.getResultList().get(q.getResultList().size() - 1));
    }finally{__CLR4_3_18k8kk159ir38.R.flushNeeded();}}

}

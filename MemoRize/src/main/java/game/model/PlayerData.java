package game.model;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "felhasznalo_adatai")
public class PlayerData {
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

    public void setNev(String nev) { this.nev = nev; }
    public void setKor(int kor) { this.kor = kor; }
    public void setNem(String nem) { this.nem = nem; }
    public void setKitoltes_ideje(Date kitoltes_ideje) { this.kitoltes_ideje = kitoltes_ideje; }

}

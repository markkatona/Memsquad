package game.model;
import javax.persistence.*;

@Entity
@Table(name = "statisztika")
public class PlayerStat {
    @Id
    private int user_id;
    @Column(name = "tapasztalati_szint")
    private int xp_lvl;
    @Column(name = "jatek_ido")
    private int game_time;
    @Column(name = "talalati_arany")
    private double hit_rate;

    public void setUser_id(int user_id) { this.user_id = user_id; }
    public void setXp_lvl(int xp_lvl) { this.xp_lvl = xp_lvl; }
    public void setGame_time(int game_time) { this.game_time = game_time; }
    public void setHit_rate(double hit_rate) { this.hit_rate = hit_rate; }
}

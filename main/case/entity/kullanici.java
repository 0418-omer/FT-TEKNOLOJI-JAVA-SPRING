public class kullanici {
import lombok.Data;

import javax.persistence.*;

    @Entity
    @Data
    @Table(name = "kullanici")
    public class Kullanici {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        @Column( nullable = false, length = 50)
        private String adi;

        @Column( nullable = false, length = 50)
        private String soyadi;

        @Column( nullable = false, length = 50)
        private String email;

        @Column( nullable = false, length = 15)
        private String telefon;
    }


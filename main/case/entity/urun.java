public class urun {
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

    @Entity
    @Data
    @Table(name = "urun")
    public class Urun {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        @Column( nullable = false)
        private String adi;

        @Column( nullable = false)
        private String fiyat;

        @Column
        private Date sonKullanmaTarihi;


    }


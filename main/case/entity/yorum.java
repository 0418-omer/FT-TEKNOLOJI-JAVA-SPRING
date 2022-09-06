public class yorum {
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

    @Entity
    @Data
    @Table(name = "urunYorum")
    public class UrunYorum {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        @Size(max = 500)
        @Column(nullable = false)
        private String yorum;

        @Column(nullable = false)
        private Date yorumTarihi;

        @ManyToOne
        private Kullanici kullanici;

        @ManyToOne
        private Urun urun;
    }


public interface urun {
import firstCase.entity.Urun;
import firstCase.entity.UrunYorum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

    public interface UrunRepo extends JpaRepository<Urun, Long> {
        /*Son kullanma tarihi geçmemiş ürünleri listeleyen bir metot yazınız. (Son kullanma tarihi boş olanlar da gelmeli.)*/
        @Query(value = "SELECT * FROM firstcase.urun u " +
                "where  u.son_kullanma_tarihi>now() " +
                "or u.son_kullanma_tarihi is null", nativeQuery = true)
        List<UrunYorum> findByUrunSonKullanmaTarihiGecmemis();

        /*Son kullanma tarihi geçmiş ürünleri listeleyen bir metot yazınız.*/
        @Query(value = "select * from firstcase.urun u " +
                "where  u.son_kullanma_tarihi<now()", nativeQuery = true)
        List<UrunYorum> findByUrunSonKullanmaTarihiGecmis();
    }


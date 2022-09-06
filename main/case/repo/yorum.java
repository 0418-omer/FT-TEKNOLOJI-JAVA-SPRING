public interface yorum {
import firstCase.entity.UrunYorum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

    public interface UrunYorumRepo extends JpaRepository<UrunYorum, Long> {

        /*Bir ürüne ait yorumları listeleyen bir metot yazınız.*/
        @Query(value = "SELECT * FROM urun_yorum uy WHERE uy.urun_id=:id", nativeQuery = true)
        List<UrunYorum> findByUrunId(Long id);

        /*Verilen tarih aralıklarında belirli bir ürüne yapılmış olan yorumları gösteren bir metot yazınız.*/
        @Query(value = "SELECT * FROM firstcase.urun_yorum uy " +
                "            inner join firstcase.urun u " +
                "            on u.id=uy.urun_id " +
                "            where u.id=:urunId and " +
                "            uy.yorum_tarihi>=:startDate and " +
                "            uy.yorum_tarihi<=:endDate" ,nativeQuery = true)
        List<UrunYorum> findByUrunFilter(LocalDate startDate, LocalDate endDate, String urunId);

        /*Bir kullanıcının yapmış olduğu yorumları listeleyen bir metot yazınız.*/
        @Query(value = "SELECT * FROM urun_yorum uy WHERE uy.kullanici_id=:id", nativeQuery = true)
        List<UrunYorum> findByKullaniciId(Long id);


        /*Bir kullanıcının belirli tarihler aralığında yapmış olduğu yorumları gösteren bir metot yazınız.*/
        @Query(value = "SELECT * FROM firstcase.urun_yorum uy " +
                "inner join firstcase.kullanici k " +
                "on k.id=uy.kullanici_id " +
                "where k.id=:kullaniciId and " +
                "uy.yorum_tarihi>=:startDate and " +
                "uy.yorum_tarihi<=:endDate", nativeQuery = true)
        List<UrunYorum> findByKullaniciFilter(LocalDate startDate, LocalDate endDate, String kullaniciId);






    }


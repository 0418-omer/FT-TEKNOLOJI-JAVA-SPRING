public interface kullanici {
import firstCase.entity.Kullanici;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface KullaniciRepo extends JpaRepository<Kullanici, Long> {
    }


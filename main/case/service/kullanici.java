public class kullanici {
import firstCase.entity.Kullanici;
import firstCase.repository.KullaniciRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


    @Service
    public class KullaniciService {

        @Autowired
        private KullaniciRepo kullaniciRepo;


        public Kullanici save(Kullanici kullanici) {
            return kullaniciRepo.save(kullanici);
        }
    }


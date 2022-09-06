public class urun {
import firstCase.entity.Urun;
import firstCase.repository.UrunRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

    @Service
    public class UrunService {
        @Autowired
        private UrunRepo urunRepo;

        public Urun save(Urun urun) {
            return urunRepo.save(urun);
        }
    }


public class yorum {


import firstCase.entity.Kullanici;
import firstCase.entity.Urun;
import firstCase.entity.UrunYorum;
import firstCase.repository.KullaniciRepo;
import firstCase.repository.UrunRepo;
import firstCase.repository.UrunYorumRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

    @Service
    public class UrunYorumService {
        @Autowired
        private UrunYorumRepo yorumRepo;
        @Autowired
        private UrunRepo urunRepo;
        @Autowired
        private KullaniciRepo kullaniciRepo;

        public UrunYorum save(UrunYorum urunYorum) {
            Optional<Urun> urun=urunRepo.findById(urunYorum.getUrun().getId());
            urunYorum.setUrun(urun.get());
            Optional<Kullanici> kullanici=kullaniciRepo.findById(urunYorum.getKullanici().getId());
            urunYorum.setKullanici(kullanici.get());
            return yorumRepo.save(urunYorum);

        }


        public List<UrunYorum> findByUrunId(Long id) {
            return yorumRepo.findByUrunId(id);
        }


        public List<UrunYorum> findByKullaniciId(Long id) {
            return yorumRepo.findByKullaniciId(id);
        }
    }


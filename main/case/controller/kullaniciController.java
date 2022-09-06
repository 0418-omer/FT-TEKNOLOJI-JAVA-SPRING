public class kullaniciController {
import firstCase.entity.Kullanici;
import firstCase.entity.Urun;
import firstCase.service.KullaniciService;
import firstCase.service.UrunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

    @CrossOrigin("*")
    @RestController
    @RequestMapping("/urun")
    public class UrunController {
        @Autowired
        private UrunService urunService;

        @PostMapping("/add")
        public Urun add(@RequestBody Urun urun){
            return urunService.save(urun);
        }
    }

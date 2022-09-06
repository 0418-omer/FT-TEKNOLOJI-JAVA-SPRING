public class UrunController {
import firstCase.entity.Kullanici;
import firstCase.service.KullaniciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

    @CrossOrigin("*")
    @RestController
    @RequestMapping("/kullanici")
    public class KullaniciController {

        @Autowired
        private KullaniciService kullaniciService;

        @PostMapping("/add")
        public Kullanici add(@RequestBody Kullanici kullanici){
            return kullaniciService.save(kullanici);
        }
    }


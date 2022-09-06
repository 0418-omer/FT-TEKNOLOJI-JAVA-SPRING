public class yorumController {
import firstCase.entity.Urun;
import firstCase.entity.UrunYorum;
import firstCase.service.UrunYorumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @CrossOrigin("*")
    @RestController
    @RequestMapping("/urunYorum")
    public class UrunYorumController {

        @Autowired
        private UrunYorumService urunYorumService;

        @PostMapping("/add")
        public UrunYorum add(@RequestBody UrunYorum urunYorum){
            return urunYorumService.save(urunYorum);
        }

        /* Bir ürüne ait yorumları listeleyen bir metot yazınız. */
        @GetMapping("urun/{id}")
        public List<UrunYorum> getOneUrun(@PathVariable("id") Long id){
            return urunYorumService.findByUrunId(id);
        }

        /*Bir kullanıcının yapmış olduğu yorumları listeleyen bir metot yazınız.*/
        @GetMapping("kullanici/{id}")
        public List<UrunYorum> getOneKullanici(@PathVariable("id") Long id){
            return urunYorumService.findByKullaniciId(id);
        }


    }


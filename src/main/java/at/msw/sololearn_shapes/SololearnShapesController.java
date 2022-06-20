package at.msw.sololearn_shapes;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // .json -> sucht nach json files
// @Controller // .html -> sucht nach html files
public class SololearnShapesController {

    /*
    @RequestMapping() // GET POST DELETE PATCh PUT
    @DeleteMapping()
    @PostMapping()
    */
    @GetMapping("/") // GET
    public String index(){
        return "hello";
    }

}

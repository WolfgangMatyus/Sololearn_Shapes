package at.msw.sololearn_shapes;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // .json -> sucht nach json files
// @Controller // .html -> sucht nach html files
public class SololearnShapesController {
    /*
    @RequestMapping() // GET POST DELETE PATCh PUT
    @DeleteMapping()
    @PostMapping()
    */
    @GetMapping("/squareArea") // GET
    public int squareArea(@RequestParam int a){
        return a * a;
    }

    @GetMapping("/circleArea") // GET
    public double circleArea(@RequestParam int a){
        return Math.PI * a * a;
    }

}

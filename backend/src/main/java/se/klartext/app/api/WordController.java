package se.klartext.app.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;
import se.klartext.app.data.api.elasticsearch.ElasticsearchWordRepository;

import java.util.List;

@RestController
public class WordController {

    @Autowired
    private ElasticsearchWordRepository wordRepo;

    @RequestMapping(value = "/api/words/search",method = RequestMethod.GET)
    public DeferredResult search(
            @RequestParam(value = "query",required = true) String query) {

        DeferredResult<List> result = new DeferredResult<>();
        wordRepo.findWordMatch(query)
                .subscribe(
                        result::setResult,
                        result::setErrorResult
                );
        return result;
    }
}

//package com.example.kabisa_backend
//
//import com.example.kabisa_backend.controller.QuoteController
//import com.example.kabisa_backend.controller.QuoteGraphController
//import com.example.kabisa_backend.model.entity.Quote
//import com.example.kabisa_backend.model.quoteapi.QuoteResponse
//import com.example.kabisa_backend.utils.BaseTestSpec
//import org.springframework.beans.factory.annotation.Autowired
//
//class QuoteGraphControllerSpec extends BaseTestSpec {
//
//    @Autowired
//    QuoteGraphController quoteGraphController
//
//    private static final String URL_RANDOM_QUOTE = "/graphql"
//    private static final String QUERY = "query{\n" +
//            "    getAllQuotes{\n" +
//            "        author\n" +
//            "        quote\n" +
//            "    }\n" +
//            "}"
//
//    def "When likeAQuote is called, likes for that quote is incremented by one"() {
//        when:
//        List<Quote> quoteResponse = postForEntityWithBody(URL_RANDOM_QUOTE, QUERY).body
//
//        then:
//        quoteResponse != null
//    }
//}

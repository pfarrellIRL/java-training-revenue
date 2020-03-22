package com.accenture.tagtrainingspring.screening;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ScreeningController {

    @Autowired
    ScreeningDao screeningDao;

    @RequestMapping(value = "/screening", method = RequestMethod.GET)
    public String getScreening(@RequestParam int id) {
        Screening screening = screeningDao.get(id);

        if (screening != null) {
            return (id + " does have a screening with a result of " + screening.getDiagnosis());
        } else {
            return (id + " does not have a screening");
        }
    }

    @RequestMapping(value = "/screenings", method = RequestMethod.GET)
    public String getScreening() {
        List<Screening> screenings = screeningDao.get();
        return screenings.toString();
    }

}

package mn.ictgroup.intern.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mn.ictgroup.intern.main.entity.Language;
import mn.ictgroup.intern.main.service.LanguageService;

/**
 *
 * @author Jimmy
 *
 */

@RestController
@RequestMapping("/language")
public class LanguageController {

    @Autowired
    private LanguageService languageService;

    @GetMapping()
    public List<Language> getLanguagesByLanguageId(@RequestParam Long languageId) {
        return this.languageService.getLanguagesByLanguageId(languageId);
    }
}
package mn.ictgroup.intern.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping()
    public void addNewLanguage(@RequestBody Language language) {
        languageService.addNewLanguage(language);
    }

    @DeleteMapping()
    public void deleteLanguage(@PathVariable("languageId") Long languageId) {
        languageService.removeLanguage(languageId);
    }
}
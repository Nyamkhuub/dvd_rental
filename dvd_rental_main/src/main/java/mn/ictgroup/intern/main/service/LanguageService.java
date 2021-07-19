package mn.ictgroup.intern.main.service;

import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

import mn.ictgroup.intern.main.dto.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mn.ictgroup.intern.main.entity.Language;
import mn.ictgroup.intern.main.repository.LanguageRepository;

/**
 *
 * @author Jimmy
 *
 */
@Service
public class LanguageService {

    @Autowired
    private LanguageRepository languageRepository;

    public List<Language> getLanguagesByLanguageId(Long languageId) {
        return this.languageRepository.findByLanguageId(languageId);
    }
    public Response addNewLanguage(Language language) {
        Optional<Language> languageOptional = languageRepository.findByLanguageName(language.getLanguageName());
        if (languageOptional.isPresent()) {
            throw new IllegalStateException("taken");
            }
        languageRepository.save(language);
        return new Response("done","done");
    }
    public void removeLanguage(Long languageId) {
        languageRepository.deleteById(languageId);
    }
}
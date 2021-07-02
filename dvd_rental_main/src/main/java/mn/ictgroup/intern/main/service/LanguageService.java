package mn.ictgroup.intern.main.service;

import java.util.List;

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
    private LanguageRepository languageRepo;

    public List<Language> getLanguagesByLanguageId(Long languageId) {
        return this.languageRepo.findByLanguageId(languageId);
    }
}
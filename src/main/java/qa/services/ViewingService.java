package qa.services;

import qa.persistence.entities.Film;
import qa.persistence.entities.Viewing;
import qa.persistence.repositories.ViewingRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class ViewingService {

    @Inject
    private ViewingRepository viewingRepository;

    public List<Viewing> getViewingsForFilm(Film film) {
        return viewingRepository.getViewingsForFilm(film);
    }
}
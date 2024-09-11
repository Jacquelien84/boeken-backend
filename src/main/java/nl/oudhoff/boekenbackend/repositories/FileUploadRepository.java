package nl.oudhoff.boekenbackend.repositories;

import nl.oudhoff.boekenbackend.models.Bookcover;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileUploadRepository extends JpaRepository<Bookcover, String> {
}

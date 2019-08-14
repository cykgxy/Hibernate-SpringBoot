package com.bookstore;

import com.bookstore.service.BookstoreService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MainApplication {
    
    private final BookstoreService bookstoreService;

    public MainApplication(BookstoreService bookstoreService) {
        this.bookstoreService = bookstoreService;
    }        

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Bean
    public ApplicationRunner init() {
        return args -> {            
            // System.out.println("\n\n deleteViaCascadeRemove()");
            // bookstoreService.deleteViaCascadeRemove();
            
            // System.out.println("\n\n deleteViaOrphanRemoval()");
            // bookstoreService.deleteViaOrphanRemoval();
            
            // System.out.println("\n\n deleteViaIdentifier()");
            // bookstoreService.deleteViaIdentifier();                        
            
            // System.out.println("\n\n deleteViaIn()");
            // bookstoreService.deleteViaIn();
            
            System.out.println("\n\n deleteViaDeleteInBatch()");
            bookstoreService.deleteViaDeleteInBatch();
        };
    }
}

package ua.ucu.edu.apps.task3;

public class CompanyReaderFacade {
    private PDLReader pdlReader;
    private BrandFetchReader brandFetchReader;

    public CompanyReaderFacade() {
        pdlReader = new PDLReader();
        brandFetchReader = new BrandFetchReader();
    }

    public Company fetch(String companyName) {
        Company companyBF = brandFetchReader.fetch(companyName);

        return companyBF;
    }

}
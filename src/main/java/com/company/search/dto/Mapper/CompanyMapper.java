package com.company.search.dto.Mapper;

import com.company.search.dto.CompanyDetails;
import com.company.search.dto.Officer;
import com.company.search.dto.truProxy.CompanyResponse;

import java.util.List;

public class CompanyMapper {
    public static CompanyDetails mapCompanyAPIResponseToCompany(CompanyResponse trueProxyCompany, List<Officer> officers) {

        return CompanyDetails.builder().companyNumber(trueProxyCompany.getCompany_number())
                .companyStatus(trueProxyCompany.getCompany_status())
                .companyType(trueProxyCompany.getCompany_type())
                .title(trueProxyCompany.getTitle())
                .dateOfCreation(trueProxyCompany.getDate_of_creation())
                .address(trueProxyCompany.getAddress())
                .officers(officers).build();
    }
}
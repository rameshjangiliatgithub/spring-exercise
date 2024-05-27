package com.company.search.dto.Mapper;

import com.company.search.dto.Officer;
import com.company.search.dto.truProxy.OfficerResponse;

public class OfficerMapper {
    public static Officer mapOfficerAPIResponseToOfficer(OfficerResponse trueProxyOfficer) {

        return Officer.builder().officer_role(trueProxyOfficer.getOfficer_role())
                .name(trueProxyOfficer.getName())
                .appointed_on(trueProxyOfficer.getAppointed_on())
                .address(trueProxyOfficer.getAddress()).build();

    }
}
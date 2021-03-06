package com.github.dreamhead.moco.parser.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.github.dreamhead.moco.MocoRest;
import com.github.dreamhead.moco.RestSettingBuilder;
import com.google.common.base.MoreObjects;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class RestPostSetting extends RestBaseSetting {
    @Override
    protected RestSettingBuilder startRestSetting() {
        return MocoRest.post();
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .omitNullValues()
                .add("request", request)
                .add("response", response)
                .toString();
    }
}

package com.example.online_bank.entity;

import lombok.Data;
import lombok.NonNull;

@Data
public abstract class AbstractBank {
    @NonNull
    protected final String name;
    @NonNull
    protected final String url;
}

package com.sook.mysonge.web.dto.calendar;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

@Getter
@NoArgsConstructor
public class CalendarUpdateRequestDto {

    private String title;
    private String color;
    private String context;
    private String location;
    private LocalDate startYmd;
    private LocalDate endYmd;
    private LocalTime startHms;
    private LocalTime endHms;
    private double x;
    private double y;

    @Builder
    public CalendarUpdateRequestDto(String title, String color, String context, String location,
                                    LocalDate startYmd, LocalDate endYmd, LocalTime startHms, LocalTime endHms, double x, double y) {
        this.title = title;
        this.color = color;
        this.context = context;
        this.location = location;
        this.startYmd = startYmd;
        this.endYmd = endYmd;
        this.startHms = startHms;
        this.endHms = endHms;
        this.x = x;
        this.y = y;
    }

}

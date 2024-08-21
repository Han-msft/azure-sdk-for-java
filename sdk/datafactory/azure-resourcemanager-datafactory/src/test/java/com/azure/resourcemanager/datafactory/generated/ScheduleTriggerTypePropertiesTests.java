// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.ScheduleTriggerTypeProperties;
import com.azure.resourcemanager.datafactory.models.DayOfWeek;
import com.azure.resourcemanager.datafactory.models.DaysOfWeek;
import com.azure.resourcemanager.datafactory.models.RecurrenceFrequency;
import com.azure.resourcemanager.datafactory.models.RecurrenceSchedule;
import com.azure.resourcemanager.datafactory.models.RecurrenceScheduleOccurrence;
import com.azure.resourcemanager.datafactory.models.ScheduleTriggerRecurrence;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ScheduleTriggerTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScheduleTriggerTypeProperties model = BinaryData.fromString(
            "{\"recurrence\":{\"frequency\":\"Hour\",\"interval\":533467013,\"startTime\":\"2021-06-20T15:09:23Z\",\"endTime\":\"2021-03-03T14:47:12Z\",\"timeZone\":\"oybpwzniekedxvw\",\"schedule\":{\"minutes\":[1538399987,35267670],\"hours\":[1480328857,950138743],\"weekDays\":[\"Wednesday\",\"Thursday\"],\"monthDays\":[1634562610,2079790685,1537807512,220269478],\"monthlyOccurrences\":[{\"day\":\"Thursday\",\"occurrence\":1191416818,\"\":{\"lsptzqaz\":\"datau\",\"jvyrdownbwrnb\":\"dataybbe\",\"smpcajx\":\"datacblmzaru\"}},{\"day\":\"Monday\",\"occurrence\":1892755426,\"\":{\"zckgbpysgzgiv\":\"datarjlwrqhehn\",\"jxxjaafr\":\"dataahektwgiumcco\",\"cnzsimbgv\":\"datadhrkhfyaxi\",\"rbogzwwyub\":\"dataksjjqqp\"}},{\"day\":\"Tuesday\",\"occurrence\":675719748,\"\":{\"byjfeanbnw\":\"datajqemgbkjxuxmkk\",\"fkzlv\":\"dataekpgllezvrvjws\"}},{\"day\":\"Tuesday\",\"occurrence\":88943257,\"\":{\"lrvquw\":\"datajynvguhqugnqs\"}}],\"\":{\"cfinsoimxxs\":\"datace\",\"xzogclusicnck\":\"databtpq\",\"r\":\"dataxflgjibtc\",\"errpal\":\"datal\"}},\"\":{\"u\":\"datasbgj\",\"hhkwlmittpbivh\":\"datazfjmnabyvm\",\"xplbdazsjbg\":\"datadxhnvy\",\"ihgbtn\":\"datadzzukhlwvvhovkad\"}}}")
            .toObject(ScheduleTriggerTypeProperties.class);
        Assertions.assertEquals(RecurrenceFrequency.HOUR, model.recurrence().frequency());
        Assertions.assertEquals(533467013, model.recurrence().interval());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-20T15:09:23Z"), model.recurrence().startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-03T14:47:12Z"), model.recurrence().endTime());
        Assertions.assertEquals("oybpwzniekedxvw", model.recurrence().timeZone());
        Assertions.assertEquals(1538399987, model.recurrence().schedule().minutes().get(0));
        Assertions.assertEquals(1480328857, model.recurrence().schedule().hours().get(0));
        Assertions.assertEquals(DaysOfWeek.WEDNESDAY, model.recurrence().schedule().weekDays().get(0));
        Assertions.assertEquals(1634562610, model.recurrence().schedule().monthDays().get(0));
        Assertions.assertEquals(DayOfWeek.THURSDAY, model.recurrence().schedule().monthlyOccurrences().get(0).day());
        Assertions.assertEquals(1191416818, model.recurrence().schedule().monthlyOccurrences().get(0).occurrence());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScheduleTriggerTypeProperties model = new ScheduleTriggerTypeProperties()
            .withRecurrence(new ScheduleTriggerRecurrence().withFrequency(RecurrenceFrequency.HOUR)
                .withInterval(533467013)
                .withStartTime(OffsetDateTime.parse("2021-06-20T15:09:23Z"))
                .withEndTime(OffsetDateTime.parse("2021-03-03T14:47:12Z"))
                .withTimeZone("oybpwzniekedxvw")
                .withSchedule(new RecurrenceSchedule().withMinutes(Arrays.asList(1538399987, 35267670))
                    .withHours(Arrays.asList(1480328857, 950138743))
                    .withWeekDays(Arrays.asList(DaysOfWeek.WEDNESDAY, DaysOfWeek.THURSDAY))
                    .withMonthDays(Arrays.asList(1634562610, 2079790685, 1537807512, 220269478))
                    .withMonthlyOccurrences(Arrays.asList(
                        new RecurrenceScheduleOccurrence().withDay(DayOfWeek.THURSDAY)
                            .withOccurrence(1191416818)
                            .withAdditionalProperties(mapOf()),
                        new RecurrenceScheduleOccurrence().withDay(DayOfWeek.MONDAY)
                            .withOccurrence(1892755426)
                            .withAdditionalProperties(mapOf()),
                        new RecurrenceScheduleOccurrence().withDay(DayOfWeek.TUESDAY)
                            .withOccurrence(675719748)
                            .withAdditionalProperties(mapOf()),
                        new RecurrenceScheduleOccurrence().withDay(DayOfWeek.TUESDAY)
                            .withOccurrence(88943257)
                            .withAdditionalProperties(mapOf())))
                    .withAdditionalProperties(mapOf()))
                .withAdditionalProperties(mapOf()));
        model = BinaryData.fromObject(model).toObject(ScheduleTriggerTypeProperties.class);
        Assertions.assertEquals(RecurrenceFrequency.HOUR, model.recurrence().frequency());
        Assertions.assertEquals(533467013, model.recurrence().interval());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-20T15:09:23Z"), model.recurrence().startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-03T14:47:12Z"), model.recurrence().endTime());
        Assertions.assertEquals("oybpwzniekedxvw", model.recurrence().timeZone());
        Assertions.assertEquals(1538399987, model.recurrence().schedule().minutes().get(0));
        Assertions.assertEquals(1480328857, model.recurrence().schedule().hours().get(0));
        Assertions.assertEquals(DaysOfWeek.WEDNESDAY, model.recurrence().schedule().weekDays().get(0));
        Assertions.assertEquals(1634562610, model.recurrence().schedule().monthDays().get(0));
        Assertions.assertEquals(DayOfWeek.THURSDAY, model.recurrence().schedule().monthlyOccurrences().get(0).day());
        Assertions.assertEquals(1191416818, model.recurrence().schedule().monthlyOccurrences().get(0).occurrence());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}

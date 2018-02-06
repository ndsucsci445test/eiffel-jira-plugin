package io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class ImmutableEiffelIssueDefinedEventMetaTest {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void noArgsBuilderHasOnlyDefaultFields() {
        ImmutableEiffelIssueDefinedEventMeta meta = ImmutableEiffelIssueDefinedEventMeta.builder().build();
        Assert.assertFalse(meta.source().isPresent());
        Assert.assertFalse(meta.tags().isPresent());
    }
}

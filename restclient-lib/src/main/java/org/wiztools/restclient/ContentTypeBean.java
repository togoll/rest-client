package org.wiztools.restclient;

import org.wiztools.restclient.util.HttpUtil;
import java.nio.charset.Charset;

/**
 *
 * @author subwiz
 */
public class ContentTypeBean implements ContentType {
    
    private String contentType;
    private Charset charset;

    public ContentTypeBean(String contentType, Charset charset) {
        this.contentType = contentType;
        this.charset = charset;
    }

    @Override
    public String getContentType() {
        return contentType;
    }

    @Override
    public Charset getCharset() {
        return charset;
    }

    @Override
    public String toString() {
        return HttpUtil.getFormattedContentType(contentType, charset);
    }
}
/*
 *  Copyright (c) 2022 Contributors to the Eclipse Foundation
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   and Apache License v2.0 which accompanies this distribution.
 *   The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 *   and the Apache License v2.0 is available at http://www.opensource.org/licenses/apache2.0.php.
 *
 *   You may elect to redistribute this code under either of these licenses.
 *
 *   Contributors:
 *
 *   Alessandro Moscatelli
 */
package org.eclipse.jnosql.mapping.metamodel.processor;

import com.sun.codemodel.CodeWriter;
import com.sun.codemodel.JPackage;
import java.io.IOException;
import java.io.OutputStream;

/**
 * CodeWriter based on an output stream.
 * This is used to write the metamodel source files.
 */
public class OutputStreamCodeWriter extends CodeWriter {
    
    private final OutputStream outputStream;
    
    public OutputStreamCodeWriter(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public OutputStream openBinary(JPackage jp, String string) throws IOException {
        return this.outputStream;
    }

    @Override
    public void close() throws IOException {
        this.outputStream.close();
    }
    
}

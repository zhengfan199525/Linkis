/*
 * Copyright 2019 WeBank
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package scala.com.webank.wedatasphere.linkis.engine.log

import com.webank.wedatasphere.linkis.common.utils.Logging
import org.slf4j.{Logger, LoggerFactory}

/**
  * created by enjoyyin on 2018/11/5
  * Description: Test the compatibility of Logging interface to Log4j2, pass the test(测试Logging接口对Log4j2的兼容性,测试通过)
  */
object ScalaLoggingTest{
  val logger:Logger = LoggerFactory.getLogger(this.getClass)
  def main(args: Array[String]): Unit = {
    logger.info("It's an info")
  }
}
